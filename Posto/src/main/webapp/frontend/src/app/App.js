import React from 'react';
import AsideBtn from './asideBtn';
import NovoAbastecimento from './mainComponents/abastecer';
import Inicio from './mainComponents/iniciotela/inicio';
import './App.css';
import './mainComponents/main.css';


class App extends React.Component {

  constructor(props){
    super(props)
    this.state = {
      mainState : <Inicio/>
    }
  }
  render(){
    return (
      <div className="container">
        <header>
          <h1>MeuPosto</h1>
        </header>
        <aside>
          <div>
            <AsideBtn text="Início" onClick={()=>this.setState({mainState : <Inicio/>})}/>
            <AsideBtn text="Abastecer" onClick={()=>this.setState({mainState : <NovoAbastecimento/>})}/>
            <AsideBtn text="Abastecer Bomba"/>
            <AsideBtn text="Levantar Faturamento"/>
            <AsideBtn text="Bombas de combustível"/>
            <AsideBtn text="Abastecimentos"/>
            <AsideBtn text="Clientes mais assíduos"/>
          </div>
        </aside>
        <main>
          {this.state.mainState}
        </main>
      </div>
    );
  }
}

export default App;
