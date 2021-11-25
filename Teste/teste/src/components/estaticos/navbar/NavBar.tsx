import AppBar from '@material-ui/core/AppBar'
import Box from '@material-ui/core/Box'
import Toolbar from '@material-ui/core/Toolbar'
import Typography from '@material-ui/core/Typography'
import React from 'react'
import { Link } from 'react-router-dom'

function NavBar() {
    return (
        <div>
            <AppBar position="static" className='fundo'>
                <Toolbar variant="dense">
                    <Box style={{ cursor: "pointer" }} >
                      <Link to={"Home"} className='text-decorator-none'  >
                        <Typography variant="h5" className='nome-site'>
                            Adivinhe se puder
                        </Typography>
                        </Link>
                    </Box>


                    <Link to={"/Sobre"} className='text-decorator-none'>
                        <Box mx={1} className='cursor'>
                            <Typography variant='h6' color='inherit'>
                                Sobre
                            </Typography>
                        </Box>
                    </Link>


                </Toolbar>
            </AppBar>
        </div>
    )
}

export default NavBar
