from gestorAplicacion.entrenador.Entrenador import Entrenador
from gestorAplicacion.pokemon.Pokemon import Pokemon
from gestorAplicacion.pokemon.Habilidad import Habilidad


class EntrenadorGimnasio(Entrenador):

    _entrenadoresGym = []

    def __init__(self, Nombre, ListaPokemon, pokemonInicial, Medellas, Gym):
        super().__init__(Nombre, ListaPokemon, pokemonInicial, Medellas)
        self._Gym = Gym
        if (isinstance(self,EntrenadorGimnasio) == True):
            EntrenadorGimnasio._entrenadoresGym.append(self)
    
    def __str__(self):
        return super().__str__() + " soy entrenador de {}".format(self._Gym.getNombre())

    @classmethod
    def getEntrenadoresGym(cls):
        return cls._entrenadoresGym

    #### get y set #### 
    def getGym(self):
        return self._Gym

    def setGym(self, nuevo):
        self._Gym = nuevo


