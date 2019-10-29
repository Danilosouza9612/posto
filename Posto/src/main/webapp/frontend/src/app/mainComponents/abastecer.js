import React from 'react';
import {InputComponent} from './component.js';

class novoAbastecimento extends React.Component{
    
    render(){
        return (
            <div>
                <form>
                    <div>
                        
                    </div>
                    <InputComponent text="Data" name="data"/>
                    <InputComponent text="Quantidade de Litros" name="litros"/>
                    <InputComponent text="CPF do Cliente" name="cpf"/>
                    <InputComponent text="Nome do Cliente" name="data"/>
                </form>
            </div>
        );
    }
}

export default novoAbastecimento;
