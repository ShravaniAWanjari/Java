import React, {useState} from 'react';
function BudgetTracker(){
    const [objects,setObject] = useState([]);
    const [text, setText] = useState("");
    const addExpense = (objectId) => ;

    return <>
    <input value={text} onChange={(e) => e.target.value} />
    <ul>
       <li>

       </li> 
    </ul><button onClick={() => addExpense(id); setText("")}>+</button>
    </>
}

export default BudgetTracker;