import React, {useState} from 'react';

function Counter(){
    const [count, setCount] = useState(0);
    const [text, setText] = useState("");

    return (<div>

        <div>Count: {count}</div>

        <button onClick={() => setCount(count + 1)}>Increment</button>
        <button onClick={() => setCount(0)}>Reset</button>

        { count > 5 && <div>Show me if count larger than 5</div>}

        <input value = {text} onChange={(e) => setText(e.target.value)}></input>


        
        </div>);
}

export default Counter;