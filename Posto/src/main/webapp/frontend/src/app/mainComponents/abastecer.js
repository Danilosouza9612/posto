import React from 'react';
import {InputComponent} from './component.js';

class NovoAbastecimento extends React.Component{
    
    render(){
        return (
            <div>
                <form>
                    <div>
                        
                    </div>
                    <InputComponent type="date" text="Data" name="data"/>
                    <InputComponent type="time" text="Hora" name="hora"/>
                    <InputComponent type="text" text="Quantidade de Litros" name="litros"/>
                    <InputComponent type="text" text="CPF do Cliente" name="cpf"/>
                    <InputComponent type="text" text="Nome do Cliente" name="nome"/>
                </form>
            </div>
        );
    }
}

export default NovoAbastecimento;
