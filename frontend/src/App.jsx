import { useState } from 'react';
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Navbar from './components/Navbar';
import Home from './pages/Home';
import Odontologos from './pages/Odontologos';
import Pacientes from './pages/Pacientes';
import Turnos from './pages/Turnos';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/odontologos" element={<Odontologos />} />
          <Route path="/pacientes" element={<Pacientes />} />
          <Route path="/turnos" element={<Turnos />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
