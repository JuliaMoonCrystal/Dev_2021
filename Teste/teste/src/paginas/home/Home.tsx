import Box from '@material-ui/core/Box';
import Button from '@material-ui/core/Button';
import Grid from '@material-ui/core/Grid';
import Typography from '@material-ui/core/Typography';
import React from 'react'
import { Link } from 'react-router-dom';

function Home() {
    return (
        <div>
            <Grid container direction="row" justifyContent="center" alignItems="center" className='fundo-1'>
                <Grid alignItems="center" item xs={12}>
                    <Box paddingX={0} >
                        <Typography variant="h3" gutterBottom color="textPrimary" component="h3" align="center" style={{ color: "Gold", fontWeight: "bold" }}>Seja bem vinde!</Typography>
                        <Typography variant="h5" gutterBottom color="textPrimary" component="h5" align="center" style={{ color: "white", fontWeight: "bold" }}>expresse aqui os seus pensamentos e opiniões!</Typography>
                    </Box>
                    <Box display="flex" justifyContent="center">
                        <Link to="/postagens" className="text-decorator-none">
                            <Button variant="outlined" className='botao'>Ver Postagens</Button>
                        </Link>

                    </Box>
                </Grid>
            </Grid>
        </div>
    )
}

export default Home;
