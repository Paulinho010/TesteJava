package teste.aula_junit;

import static org.junit.jupiter.api.Assetions.assetEquals;
public class AppTest {

//ADULTOS
//BAIXO PESO MUITO GRAVE
//----------------------------------------------------------------------------------------

@Test
public void testeBaixoPesoMuitoGraveAdulto20() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Baixo peso muito grave", calc.calcularImc(49.0, 1.7556, 20, "masculino"))
}

@Test
public void testeBaixoPesoMuitoGraveAdulto65() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Baixo peso muito grave", calc.calcularImc(49.0, 1.7556, 20, "masculino"))
}


//ADULTOS
//BAIXO PESO GRAVE
//----------------------------------------------------------------------------------------


@Test
public void testeBaixoPesoGraveAdulto20LimiteMinimo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Baixo peso grave", calc.calcularImc(49.0, 1.75, 20, "masculino"))
}

@Test
public void testeBaixoPesoGraveAdulto65LimiteMinimo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Baixo peso grave", calc.calcularImc(49.0, 1.75, 65, "masculino"))
}

@Test
public void testeBaixoPesoGraveAdulto20LimiteMaximo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Baixo peso grave", calc.calcularImc(55.0, 1.799, 20, "masculino"))
}

@Test
public void testeBaixoPesoGraveAdulto65LimiteMaximo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Baixo peso grave", calc.calcularImc(55.0, 1.799, 65, "masculino"))
}


//ADULTOS
//BAIXO PESO
//----------------------------------------------------------------------------------------


@Test
public void testeBaixoPesoAdulto20LimiteMinimo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Baixo peso", calc.calcularImc(53.0, 1.761, 20, "masculino"))
}

@Test
public void testeBaixoPesoAdulto65LimiteMinimo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Baixo peso", calc.calcularImc(53.0, 1.761, 65, "masculino"))
}
@Test
public void testeBaixoPesoAdulto20LimiteMaximo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Baixo peso", calc.calcularImc(41.0, 1.49, 20, "masculino"))
}
@Test
public void testeBaixoPesoAdulto65LimiteMaximo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Baixo peso", calc.calcularImc(49.0, 1.75, 65, "masculino"))
}


//ADULTOS
//PESO NORMAL
//----------------------------------------------------------------------------------------

@Test
public void testePesoNormalAdulto20LimiteMinimo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Peso normal", calc.calcularImc(50.0, 1.64, 20, "masculino"))
}

@Test
public void testePesoNormalAdulto65LimiteMinimo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Peso normal", calc.calcularImc(50.0, 1.64, 65, "masculino"))
}

@Test
public void testePesoNormalAdulto20LimiteMaximo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Peso normal", calc.calcularImc(72.0, 1.70, 20, "masculino"))
}

@Test
public void testePesoNormalAdulto65LimiteMaximo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Peso normal", calc.calcularImc(72.0, 1.70, 65, "masculino"))
}


//ADULTOS
//SOBREPESO
//----------------------------------------------------------------------------------------


@Test
public void testeSobrepesoAdulto20LimiteMinimo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Peso normal", calc.calcularImc(72.0, 1.697, 20, "masculino"))
}

@Test
public void testeSobrepesoAdulto65LimiteMinimo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Peso normal", calc.calcularImc(72.0, 1.697, 65, "masculino"))
}

@Test
public void testeSobrepesoAdulto20LimiteMaximo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Peso normal", calc.calcularImc(92.0, 1.753, 20, "masculino"))
}

@Test
public void testeSobrepesoAdulto65LimiteMaximo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Peso normal", calc.calcularImc(92.0, 1.753, 65, "masculino"))
}

//ADULTOS
//OBESIDADE GRAU 1
//----------------------------------------------------------------------------------------


@Test
public void testeObesidadeGrau1Adulto20LimiteMinimo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade grau 1", calc.calcularImc(86.0, 1.691, 20, "masculino"))
}

@Test
public void testeObesidadeGrau1Adulto65LimiteMinimo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade grau 1", calc.calcularImc(86, 1.691, 65, "masculino"))
}

@Test
public void testeObesidadeGrau1Adulto65LimiteMaximo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade grau 1", calc.calcularImc(100.0, 1.691, 65, "masculino"))
}

@Test
public void testeObesidadeGrau1Adulto20LimiteMaximo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade grau 1", calc.calcularImc(100.0, 1.691, 20, "masculino"))
}


//ADULTOS
//OBESIDADE GRAU 2
//----------------------------------------------------------------------------------------

@Test
public void testeObesidadeGrau2Adulto20LimiteMinimo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade grau 2", calc.calcularImc(84.0, 1.55, 20, "masculino"))
}

@Test
public void testeObesidadeGrau2Adulto65LimiteMinimo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade grau 2", calc.calcularImc(84.0, 1.55, 65, "masculino"))
}

@Test
public void testeObesidadeGrau2Adulto20LimiteMaximo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade grau 2", calc.calcularImc(96.0, 1.55, 20, "masculino"))
}

@Test
public void testeObesidadeGrau2Adulto65LimiteMaximo() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade grau 2", calc.calcularImc(96.0, 1.55, 65, "masculino"))
}

//ADULTOS
//OBESIDADE GRAU 3 (OBESIDADE MORBIDA)
//----------------------------------------------------------------------------------------

@Test
public void testeObesidadeGrau3Adulto20 {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade grau 3 (Obesidade Mórbida)", calc.calcularImc(97.0, 1.55, 20, "masculino"))

}

@Test
public void testeObesidadeGrau3Adulto20 {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade grau 3 (Obesidade Mórbida)", calc.calcularImc(97.0, 1.55 65, "masculino"))

}

//IDOSOS MULHERES
//BAIXO PESO
//----------------------------------------------------------------------------------------
@Test
public void testeBaixoPesoIdososMulheres() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Baixo peso Idosas", calc.calcularImc(55.0, 1.70, 66, "feminino"))
}


//IDOSOS MULHERES
//PESO NORMAL
//----------------------------------------------------------------------------------------
@Test
public void testePesoNormalIdososMulheres() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Peso normal Idosas", calc.calcularImc(65.0, 1.719, 66, "feminino"))
}

@Test
public void testePesoNormalIdososMulheres() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Peso normal Idosas", calc.calcularImc(80.0, 1.721, 66, "feminino"))
}

//IDOSOS MULHERES
//SOBREPESO
//----------------------------------------------------------------------------------------
@Test
public void testeSobrepesoIdososMulheres() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Sobrepeso Idosas", calc.calcularImc(80.0, 1.718, 66, "feminino"))
}

@Test
public void testeSobrepesoIdososMulheres() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Sobrepeso Idosas", calc.calcularImc(95.0, 1.723, 66, "feminino"))
}

//IDOSOS MULHERES
//OBESIDADE GRAU 1
//----------------------------------------------------------------------------------------

@Test
public void testeObesidadeGrau1IdososMulheres() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade Grau 1 Idosas", calc.calcularImc(95.0, 1.72, 66, "feminino"))
}

@Test
public void testeObesidadeGrau1IdososMulheres() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade Grau 1 Idosas", calc.calcularImc(100.0, 1.644, 66, "feminino"))
}

//IDOSOS MULHERES
//OBESIDADE GRAU 2
//----------------------------------------------------------------------------------------

@Test
public void testeObesidadeGrau2IdososMulheres() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade Grau 2 Idosas", calc.calcularImc(100.0, 1.641, 66, "feminino"))
}

@Test
public void testeObesidadeGrau2IdososMulheres() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade Grau 2 Idosas", calc.calcularImc(113.0, 1.642, 66, "feminino"))
}

//IDOSOS MULHERES
//OBESIDADE GRAU 3
//----------------------------------------------------------------------------------------


@Test
public void testeObesidadeGrau3IdososMulheres() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade Grau 3 Idosas (Obesidade Mórbida)", calc.calcularImc(113.0, 1.64, 66, "masculino"))
}

//IDOSOS HOMENS
//BAIXO PESO
//----------------------------------------------------------------------------------------
@Test
public void testeBaixoPesoIdososHomens() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Baixo peso Idosos (Obesidade Mórbida)", calc.calcularImc(57.0, 1.649, 66, "masculino"))
}

//IDOSOS HOMENS
//PESO NORMAL
//----------------------------------------------------------------------------------------
@Test
public void testePesoNormalIdososHomens() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Peso normal Idosos", calc.calcularImc(60.0, 1.651, 66, "masculino"))
}

@Test
public void testePesoNormalIdososHomens() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Peso normal Idosos", calc.calcularImc(83.0, 1.753, 66, "masculino"))
}

//IDOSOS HOMENS
//SOBREPESO
//----------------------------------------------------------------------------------------
@Test
public void testeSobrePesoIdososHomens() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Sobrepeso Idosos", calc.calcularImc(83.0, 1.75, 66, "masculino"))
}

@Test
public void testeSobrePesoIdososHomens() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Sobrepeso Idosos", calc.calcularImc(93.0, 1.7511, 66, "masculino"))
}

//IDOSOS HOMENS
//OBESIDADE GRAU 1
//----------------------------------------------------------------------------------------
@Test
public void testeObesidadeGrau1IdososHomens() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade Grau 1 Idosos", calc.calcularImc(95.0, 1.75, 66, "masculino"))
}

@Test
public void testeObesidadeGrau1IdososHomens() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade Grau 1 Idosos", calc.calcularImc(95.0, 1.6472, 66, "masculino"))
}

//IDOSOS HOMENS
//OBESIDADE GRAU 2
//----------------------------------------------------------------------------------------
@Test
public void testeObesidadeGrau2IdososHomens() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade Grau 2 Idosos", calc.calcularImc(95.0, 1.6451, 66, "masculino"))
}

@Test
public void testeObesidadeGrau2IdososHomens() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade Grau 2 Idosos", calc.calcularImc(90.0, 1.50, 66, "masculino"))
}

//IDOSOS HOMENS
//OBESIDADE GRAU 3
//----------------------------------------------------------------------------------------
@Test
public void testeObesidadeGrau3IdososHomens() {
CalculadoraIMC calc = new calculadoraIMC();
assertEquals("Obesidade Grau 3 Idosos (Obesidade Mórbida)", calc.calcularImc(93.0, 1.50, 66, "masculino"))
}

//MENINOS
//2,4,6,8,10,12,14,16,18 ANOS

//meninos 2 anos//
     
     @Test
     public void testeBaixoPesoMeninos2Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(11.0, 0.9, 2, "masculino"));
    }
     
     @Test
     public void testePesoNormalMeninos2Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(12.0, 0.9, 2, "masculino"));
    }
     
     @Test
     public void testeSobrepesoMeninos2Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(15.0, 0.9, 2, "masculino"));
    }
     
     @Test
     public void testeObesidadeMeninos2Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(18.0, 0.96, 2, "masculino"));
    } 
     
     //-----------------------------------------------------------------------------//


 //meninas 4 anos//
     
     @Test
     public void testeBaixoPesoMeninas4Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(13.0, 1.02, 4, "feminino"));
    }
     
     @Test
     public void testePesoNormalMeninas4Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(14.0, 1.02, 4, "feminino"));
    }
     
     @Test
     public void testeSobrepesoMeninas4Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(18.0, 1.02, 4, "feminino"));
    }
     
     @Test
     public void testeObesidadeMeninas4Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(20.0, 1.02, 4, "feminino"));
    }
     
     
     //-------------------------------------------------------------------------//
     
//meninos 4 anos//
     
     @Test
     public void testeBaixoPesoMeninos4Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(14.0, 1.03, 4, "masculino"));
    }
     
     @Test
     public void testePesoNormalMeninos4Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(16.0, 1.03, 4, "masculino"));
    }
     
     @Test
     public void testeSobrepesoMeninos4Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(18.0, 1.03, 4, "masculino"));
    }
     
     @Test
     public void testeObesidadeMeninos4Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(20.0, 1.03, 4, "masculino"));
    } 
//-----------------------------------------------------------------------------------------//
     
 //meninas 6 anos//
     
     @Test
     public void testeBaixoPesoMeninas6Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(16.0, 1.13, 6, "feminino"));
    }
     
     @Test
     public void testePesoNormalMeninas6Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(17.0, 1.13, 6, "feminino"));
    }
     
     @Test
     public void testeSobrepesoMeninas6Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(24.0, 1.13, 6, "feminino"));
    }
     
     @Test
     public void testeObesidadeMeninas6Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(26.0, 1.13, 6, "feminino"));
    }
     
     
     //-------------------------------------------------------------------------//
     
//meninos 6 anos//
     
     @Test
     public void testeBaixoPesoMeninos6Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(16.0, 1.14, 6, "masculino"));
    }
     
     @Test
     public void testePesoNormalMeninos6Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(18.0, 1.14, 6, "masculino"));
    }
     
     @Test
     public void testeSobrepesoMeninos6Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(24.0, 1.14, 6, "masculino"));
    }
     
     @Test
     public void testeObesidadeMeninos6Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(26.0, 1.14, 6, "masculino"));
    }     
     
     //-----------------------------------------------------------------------------------------//
     
 //meninas 8 anos//
     
     @Test
     public void testeBaixoPesoMeninas8Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(20.0, 1.25, 8, "feminino"));
    }
     
     @Test
     public void testePesoNormalMeninas8Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(22.0, 1.25, 8, "feminino"));
    }
     
     @Test
     public void testeSobrepesoMeninas8Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(30.0, 1.25, 8, "feminino"));
    }
     
     @Test
     public void testeObesidadeMeninas8Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(34.0, 1.25, 8, "feminino"));
    }
     
     
     //-------------------------------------------------------------------------//
     
//meninos 8 anos//
     
     @Test
     public void testeBaixoPesoMeninos8Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(20.0, 1.26, 8, "masculino"));
    }
     
     @Test
     public void testePesoNormalMeninos8Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(24.0, 1.26, 8, "masculino"));
    }
     
     @Test
     public void testeSobrepesoMeninos8Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(32.0, 1.26, 8, "masculino"));
    }
     
     @Test
     public void testeObesidadeMeninos8Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(36.0, 1.26, 8, "masculino"));
    }    

//-----------------------------------------------------------------------------------------//
     
 //meninas 10 anos//
     
     @Test
     public void testeBaixoPesoMeninas10Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(25.0, 1.37, 10, "feminino"));
    }
     
     @Test
     public void testePesoNormalMeninas10Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(36.0, 1.37, 10, "feminino"));
    }
     
     @Test
     public void testeSobrepesoMeninas10Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(40.0, 1.37, 10, "feminino"));
    }
     
     @Test
     public void testeObesidadeMeninas10Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(45.0, 1.37, 10, "feminino"));
    }
     
     
     //-------------------------------------------------------------------------//
     
//meninos 10 anos//
     
     @Test
     public void testeBaixoPesoMeninos10Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(25.0, 1.36, 10, "masculino"));
    }
     
     @Test
     public void testePesoNormalMeninos10Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(35.0, 1.36, 10, "masculino"));
    }
     
     @Test
     public void testeSobrepesoMeninos10Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(40.0, 1.36, 10, "masculino"));
    }
     
     @Test
     public void testeObesidadeMeninos10Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(44.0, 1.36, 10, "masculino"));
    }

//-----------------------------------------------------------------------------------------//
     
 //meninas 12 anos//
     
     @Test
     public void testeBaixoPesoMeninas12Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(30.0, 1.48, 12, "feminino"));
    }
     
     @Test
     public void testePesoNormalMeninas12Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(44.0, 1.48, 12, "feminino"));
    }
     
     @Test
     public void testeSobrepesoMeninas12Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(50.0, 1.48, 12, "feminino"));
    }
     
     @Test
     public void testeObesidadeMeninas12Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(60.0, 1.48, 12, "feminino"));
    }
     
     
     //-------------------------------------------------------------------------//
     
//meninos 12 anos//
     
     @Test
     public void testeBaixoPesoMeninos12Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(30.0, 1.46, 12, "masculino"));
    }
     
     @Test
     public void testePesoNormalMeninos12Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(44.0, 1.46, 12, "masculino"));
    }
     
     @Test
     public void testeSobrepesoMeninos12Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(50.0, 1.46, 12, "masculino"));
    }
     
     @Test
     public void testeObesidadeMeninos12Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(55.0, 1.46, 12, "masculino"));
    } 


//-----------------------------------------------------------------------------------------//
     
 //meninas 14 anos//
     
     @Test
     public void testeBaixoPesoMeninas14Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(35.0, 1.52, 14, "feminino"));
    }
     
     @Test
     public void testePesoNormalMeninas14Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(45.0, 1.52, 14, "feminino"));
    }
     
     @Test
     public void testeSobrepesoMeninas14Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(55.0, 1.52, 14, "feminino"));
    }
     
     @Test
     public void testeObesidadeMeninas14Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(68.0, 1.52, 14, "feminino"));
    }
     
     
     //-------------------------------------------------------------------------//
     
//meninos 14 anos//
     
     @Test
     public void testeBaixoPesoMeninos14Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(35.0, 1.53, 14, "masculino"));
    }
     
     @Test
     public void testePesoNormalMeninos14Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(44.0, 1.53, 14, "masculino"));
    }
     
     @Test
     public void testeSobrepesoMeninos14Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(55.0, 1.53, 14, "masculino"));
    }
     
     @Test
     public void testeObesidadeMeninos14Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(68.0, 1.53, 14, "masculino"));
    }

//-----------------------------------------------------------------------------------------//
     
 //meninas 16 anos//
     
     @Test
     public void testeBaixoPesoMeninas16Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(35.0, 1.55, 16, "feminino"));
    }
     
     @Test
     public void testePesoNormalMeninas16Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(45.0, 1.55, 16, "feminino"));
    }
     
     @Test
     public void testeSobrepesoMeninas16Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(60.0, 1.55, 16, "feminino"));
    }
     
     @Test
     public void testeObesidadeMeninas16Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(74.0, 1.55, 16, "feminino"));
    }
     
     
     //-------------------------------------------------------------------------//
     
//meninos 16 anos//
     
     @Test
     public void testeBaixoPesoMeninos16Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(37.0, 1.57, 16, "masculino"));
    }
     
     @Test
     public void testePesoNormalMeninos16Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(44.0, 1.57, 16, "masculino"));
    }
     
     @Test
     public void testeSobrepesoMeninos16Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(60.0, 1.57, 16, "masculino"));
    }
     
     @Test
     public void testeObesidadeMeninos16Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(72.0, 1.57, 16, "masculino"));
    }

//-----------------------------------------------------------------------------------------//
     
 //meninas 18 anos//
     
     @Test
     public void testeBaixoPesoMeninas18Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(40.0, 1.60, 18, "feminino"));
    }
     
     @Test
     public void testePesoNormalMeninas18Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(45.0, 1.60, 18, "feminino"));
    }
     
     @Test
     public void testeSobrepesoMeninas18Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(65.0, 1.60, 18, "feminino"));
    }
     
     @Test
     public void testeObesidadeMeninas18Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(78.0, 1.60, 18, "feminino"));
    }
     
     
     //-------------------------------------------------------------------------//
     
//meninos 18 anos//
     
     @Test
     public void testeBaixoPesoMeninos18Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Baixo peso", calc.calcularImc(45.0, 1.65, 18, "masculino"));
    }
     
     @Test
     public void testePesoNormalMeninos18Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Peso normal", calc.calcularImc(55.0, 1.65, 18, "masculino"));
    }
     
     @Test
     public void testeSobrepesoMeninos18Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Sobrepeso", calc.calcularImc(70.0, 1.65, 18, "masculino"));
    }
     
     @Test
     public void testeObesidadeMeninos18Anos() {
        CalculadoraIMC calc = new CalculadoraIMC();
        assertEquals("Obesidade", calc.calcularImc(85.0, 1.65, 18, "masculino"));
    }   
     
 
}

//adulto 28
//idosos 20
//crianças 72

}
