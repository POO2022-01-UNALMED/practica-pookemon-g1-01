
from Entrenador import Entrenador


class EntrenadorGimnasio(Entrenador):

    def __init__(self, Nombre, ListaPokemon, pokemonInicial, Medellas, Gym):
        super().__init__(Nombre, ListaPokemon, pokemonInicial, Medellas)
        self.Gym = Gym
    
    def __str__(self):
        return super().__str__() + " soy entrenador de {}".format(self.Gym)

    #### get y set #### 
    def getGym(self):
        return self.Gym

    def setGym(self, nuevo):
        self.Gym = nuevo


"""entrenador2 = EntrenadorGimnasio("haison",[1,2,3],1,["kanto"],"unal")

print(entrenador2)"""