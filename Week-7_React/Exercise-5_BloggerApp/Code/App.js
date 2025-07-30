import React from "react";
import CourseDetails from "./components/CourseDetails";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import "./App.css";

function App() {
  return (
    <div className="App">
      {/* This container will hold the three components side-by-side */}
      <div className="container">
        {/* Course Details Component */}
        <div className="component-container">
          <CourseDetails />
        </div>

        {/* Book Details Component */}
        <div className="component-container">
          <BookDetails />
        </div>

        {/* Blog Details Component */}
        <div className="component-container">
          <BlogDetails />
        </div>
      </div>
    </div>
  );
}

export default App;
