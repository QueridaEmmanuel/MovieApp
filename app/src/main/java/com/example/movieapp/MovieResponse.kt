package com.example.movieapp

data class MovieResponse(
    val results: List<Movie>
)

data class Movie(
    val title: String,
    val overview: String,
    val poster_path: String
)
