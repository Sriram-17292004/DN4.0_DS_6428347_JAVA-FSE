import React, { useState } from "react";
import CurrencyConverter from "./CurrencyConverter";

function App() {
  const [count, setCount] = useState(5);

  const increment = () => {
    setCount(count + 1);
    alert("Hello, member!! You have incremented the count.");
  };

  const decrement = () => {
    setCount(count - 1);
    alert("Hello, member!! You have decremented the count.");
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleClick = (e) => {
    alert("I was clicked");
  };

  return (
    <div style={{ padding: "20px" }}>
      <h2>{count}</h2>
      <button onClick={increment}>Increment</button>
      <br />
      <button onClick={decrement}>Decrement</button>
      <br />
      <button onClick={() => sayWelcome("welcome")}>Say welcome</button>
      <br />
      <button onClick={handleClick}>Click on me</button>
      <hr />
      <CurrencyConverter />
    </div>
  );
}

export default App;
