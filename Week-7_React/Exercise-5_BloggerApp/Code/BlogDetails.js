import React from "react";
import { blogs } from "../data/blogs"; // Import data

function BlogDetails() {
  return (
    <div>
      <h1>Blog Details</h1>
      {blogs.map((blog) => (
        <div key={blog.id}>
          <h2>{blog.title}</h2>
          <p>{blog.author}</p>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;
