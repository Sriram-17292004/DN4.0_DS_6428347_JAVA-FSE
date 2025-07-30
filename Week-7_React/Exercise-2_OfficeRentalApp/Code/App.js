import React from "react";
import officeImg from "./officeSpace.jpg";

function App() {
  const heading = "Office Space";
  const officeItem = {
    Name: "DBS",
    Rent: 100000,
    Address: "Chennai",
  };

  const rentStyle = {
    color: officeItem.Rent <= 60000 ? "red" : "green",
  };

  return (
    <div
      style={{
        textAlign: "center",
        backgroundColor: "#d3d3d3",
        padding: "20px",
      }}
    >
      <h1>{heading}, at Affordable Range</h1>
      <img src={officeImg} alt="Office Space" width="25%" height="25%" />
      <h2>Name: {officeItem.Name}</h2>
      <h3 style={rentStyle}>Rent: Rs. {officeItem.Rent}</h3>
      <h3>Address: {officeItem.Address}</h3>
    </div>
  );
}

export default App;
