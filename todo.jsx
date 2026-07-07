import React , {useState} from 'react';


function Todo(){
    const [todos, setTodos] = useState([]);
    const [text, setText] = useState("");
    const handleDelete = (indexToDelete) => {
        const updatedTodos = todos.filter((_,index) => index !== indexToDelete);
        setTodos(updatedTodos);
    };
    const toggleTodo = (indexToToggle) => {
        const updatedTodos = todos.map((todo, index) => {
            if (index === indexToToggle){
                return {...todo, isCompleted: !todo.isCompleted};
            }
        });
        setTodos(updatedTodos)
    };
    return <>

        <ul>{todos.map((todo,index) => (
            <li key={index}>{todo}
                            <button onClick={() => handleDelete(index)}>Delete</button>
            </li>
        ))}</ul>
        <input value = {text} onChange={(e) => setText(e.target.value)}/>
        <button onClick={() => {setTodos([...todos,text]); setText("")}}>Add</button>
    </>
    
}

export default Todo;