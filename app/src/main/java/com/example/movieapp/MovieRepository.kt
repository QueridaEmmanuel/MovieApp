package com.example.movieapp

class MovieRepository {
    private val movieApi = MovieService.create()

    suspend fun getNowPlayingMovies(apiKey: String): List<Movie> {
        return movieApi.getNowPlayingMovies(apiKey).results
    }
}
