from gestorAplicacion.pokemon.Pokemon import Pokemon

class CentroPokemon():

    nombre = "50A"

    def __init__(self):
        self.nombre 

    def __str__(self) -> str:
        return "hola, curaremos a tu pokemon"

    """get """

    def getNombre(self):
        return self.nombre

    """metodo especial"""

    def CurarPokemon(self, pokemon):
        if pokemon.getVida() < pokemon.getVidaMax():
            pokemon.setVida(pokemon.getVidaMax())
        return "El Pokemon {} se ha curado".format(pokemon.getNombre())

