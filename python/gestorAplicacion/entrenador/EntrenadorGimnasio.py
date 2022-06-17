
from gestorAplicacion.entrenador.Entrenador import Entrenador


class EntrenadorGimnasio(Entrenador):

    def __init__(self, Nombre, ListaPokemon, pokemonInicial, Medellas, Gym):
        super().__init__(Nombre, ListaPokemon, pokemonInicial, Medellas)
        self._Gym = Gym
    
    def __str__(self):
        return super().__str__() + " soy entrenador de {}".format(self._Gym.getNombre())

    #### get y set #### 
    def getGym(self):
        return self._Gym

    def setGym(self, nuevo):
        self._Gym = nuevo


