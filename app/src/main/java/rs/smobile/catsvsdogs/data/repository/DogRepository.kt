package rs.smobile.catsvsdogs.data.repository

import rs.smobile.catsvsdogs.data.network.NetworkDataSource
import javax.inject.Inject


class DogRepository @Inject constructor(
    private val networkDataSource: NetworkDataSource
) : ImageRepository {

    override suspend fun getRandomImage() = networkDataSource.getDogImage().toLocal()

}