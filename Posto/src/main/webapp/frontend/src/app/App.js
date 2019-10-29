import React from 'react';
import AsideBtn from './asideBtn';
import NovoAbastecimento from './mainComponents/abastecer';
import './App.css';
import './mainComponents/main.css';


function App() {
  return (
    <div className="container">
      <header>
        <h1>Postanager</h1>
      </header>
      <aside>
        <div>
          <h4>Abastecimentos</h4>
          <AsideBtn text="Abastecer"/>
          <AsideBtn text="Abastecer Bomba"/>
          <AsideBtn text="Levantar Faturamento"/>
          <AsideBtn text="Bombas de combustível"/>
          <AsideBtn text="Abastecimentos"/>
          <AsideBtn text="Clientes mais assíduos"/>
        </div>
      </aside>
      <main>
        <NovoAbastecimento/>
      </main>
    </div>
  );
}

export default App;
