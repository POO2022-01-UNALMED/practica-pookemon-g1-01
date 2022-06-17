from gestorAplicacion.entrenador.Entrenador import Entrenador
from gestorAplicacion.pokemon.Pokemon import Pokemon
from gestorAplicacion.pokemon.Habilidad import Habilidad

class EntrenadorRoket(Entrenador):

    _entrenadoresRoket = []

    def __init__(self, Nombre, ListaPokemon, pokemonInicial,Medellas = None):
        super().__init__(Nombre, ListaPokemon, pokemonInicial,Medellas)
        if (isinstance(self,EntrenadorRoket) == True):
            EntrenadorRoket._entrenadoresRoket.append(self)

    def __str__(self):
        return "mi nombre es {} y quiero robar tu pokemon".format(self.getNombre())

    @classmethod
    def getEntrenadoresRoket(cls):
        return cls._entrenadoresRoket
