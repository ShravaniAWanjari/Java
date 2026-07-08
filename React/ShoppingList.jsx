import React, {useState} from 'react';

function ShoppingList(){

    const [items, setItems] = useState([]);
    const [text, setText] = useState([]);
    const handleIncrement = (targetId) => {
        const updatedItems = items.map((item) => {
            if (item.id == targetId){
                return {...item, quantity : item.quantity + 1};
            }
            return item;
        });
        setItems(updatedItems);
    };
    return <>
            <input value = {text} onChange={(e) => setText(e.target.value)} />
            <button onClick={() => {setItems([...items,{id:Date.now(), name: text, quantity:1}]); setText("")}}>;
                Add
            </button>
            <ul> {items.map( ({id,name,quantity}) => (
                <li key={id}>{name} (Qty: {quantity})
                <button onClick={() => handleIncrement(id)}>+</button>
                </li>
                
            )
            )}   
            </ul>
    </>
}


export default ShoppingList;