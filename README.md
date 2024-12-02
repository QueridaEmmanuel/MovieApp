Android Project 3 - MovieApp
Submitted by: Querida Emmanuel

MovieApp is a movie browsing app that allows users to browse movies currently playing in theaters.

Time spent: 7 hours spent in total.

Required Features
The following required functionality is completed:

 Make a request to The Movie Database API's now_playing endpoint to get a list of current movies
 Parse through JSON data and implement a RecyclerView to display all movies
 Use Glide to load and display movie poster images
The following optional features are implemented:

 Improve and customize the user interface through styling and coloring
 Implement orientation responsivity
App neatly arranges data in both landscape and portrait mode.
 Implement Glide to display placeholder graphics during loading
Note: Placeholder graphics were implemented, but capturing them via GIF was not possible without throttling network speeds. A screencap of Glide code is included instead.
The following additional features are implemented:

 Implemented a polished app theme for a better user experience.
 Included error handling for network requests (e.g., displaying a user-friendly message when the API is unreachable).
Video Walkthrough

<div>
    <a href="https://www.loom.com/share/3b9b4239a7c04b47a71cc416d79e0d2c">
    </a>
    <a href="https://www.loom.com/share/3b9b4239a7c04b47a71cc416d79e0d2c">
      <img style="max-width:300px;" src="https://cdn.loom.com/sessions/thumbnails/3b9b4239a7c04b47a71cc416d79e0d2c-a54da3d602516e54-full-play.gif">
    </a>
  </div>



Notes
The app faced challenges during development due to:
Missing INTERNET permissions, which caused network request errors initially.
Emulator connectivity issues that required debugging.
Parsing TMDb's partial image URLs and correctly combining them with the base path for Glide.
These challenges were resolved through careful debugging, checking documentation, and verifying API responses.

License
text
Copy code
Copyright 2024 Querida Emmanuel

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
