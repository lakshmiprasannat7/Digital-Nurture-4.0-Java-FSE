import React from 'react';
import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore name="lochana" school="SJIT" total={458} goal={5} />
    </div>
  );
}

export default App;