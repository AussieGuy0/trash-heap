import React from 'react'
import ReactDOM from 'react-dom'
import './index.css'
import Popular from './components/Popular'
import Battle from './components/Battle'

// Component
//  State
//  Lifecyce
//  UI


class App extends React.Component {
    render() {
        return (
            <div className='container'>
                <Battle/>
            </div>      
        )
    }
}

ReactDOM.render(
    <App/>,
    document.getElementById('app')
)