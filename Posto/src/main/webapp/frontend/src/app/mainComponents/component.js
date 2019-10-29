import React from 'react'

export const InputComponent = function(props){
    return (
        <div>
            <label for={props.name}>{props.text}</label>
            <input type={props.type} name={props.name} id={props.name} value={props.value}></input>
        </div>
    );
}
export const OptionComponent = function(props){
    const options = props.options.map((op) => <option value={op.id}>{op.nome}</option>)

    return (
        <div>
            <label for={props.name}>{props.text}</label>
            <select name={props.name} id={props.name}>
                {options}
            </select>
        </div>
    );
}

export default InputComponent;