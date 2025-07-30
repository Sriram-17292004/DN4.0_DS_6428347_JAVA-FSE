import React from "react";

export default function Scorebelow70({ players }) {
  const filtered = players.filter((item) => item.score <= 70);

  return (
    <div>
      {filtered.map((item, index) => (
        <div key={index}>
          <li>
            Mr. {item.name} <span>{item.score}</span>
          </li>
        </div>
      ))}
    </div>
  );
}
