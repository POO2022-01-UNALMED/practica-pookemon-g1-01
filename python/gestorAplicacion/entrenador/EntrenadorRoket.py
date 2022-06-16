from gestorAplicacion.entrenador.Entrenador import Entrenador

class EntrenadorRoket(Entrenador):

    def __init__(self, Nombre, ListaPokemon, pokemonInicial,Medellas = None):
        super().__init__(Nombre, ListaPokemon, pokemonInicial,Medellas)

    def __str__(self):
        return "mi nombre es {} y quiero robar tu pokemon".format(self.getNombre())

"""james = EntrenadorRoket("james",[4,5,6],4)

print(james)"""