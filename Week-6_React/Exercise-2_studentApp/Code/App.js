import logo from './logo.svg';
import './App.css';
import { Home } from './Components/Home'
import { About } from './Components/About';
import { ContactUs } from './Components/ContactUs';

function App() {
  return (
    <div>
      <Home/>
      <About/>
      <ContactUs/>
    </div>
  );
}

export default App;
