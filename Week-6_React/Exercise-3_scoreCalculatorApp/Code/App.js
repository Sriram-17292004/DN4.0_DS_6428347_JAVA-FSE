import logo from "./logo.svg";
import "./App.css";
import { CalculateScore } from "./Components/CalculateScore";

function App() {
  return (
    <CalculateScore
      Name={"Sriram"}
      School={"Winfield High School"}
      Total={89}
      Goal={1}
    />
  );
}

export default App;
