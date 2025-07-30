import React, { useState } from "react";

function CurrencyConverter() {
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("");
  const [converted, setConverted] = useState(null);

  const handleSubmit = (e) => {
    e.preventDefault();
    if (currency.toLowerCase() === "euro") {
      const result = parseFloat(amount) / 90;
      setConverted(result.toFixed(2));
    } else {
      setConverted("Unsupported currency");
    }
    alert(
      "Currency conversion completed! and converted value to " +
        currency +
        " is " +
        converted
    );
  };

  return (
    <div>
      <h2 style={{ color: "green" }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <label>
          Amount:
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
            required
          />
        </label>
        <br />
        <label>
          Currency:
          <input
            type="text"
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
            required
          />
        </label>
        <br />
        <button type="submit">Submit</button>
      </form>
      {converted && <h3>Converted Value: {converted}</h3>}
    </div>
  );
}

export default CurrencyConverter;
