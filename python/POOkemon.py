from gestorAplicacion.entrenador.Entrenador  import Entrenador
from gestorAplicacion.entrenador.EntrenadorGimnasio  import EntrenadorGimnasio
from gestorAplicacion.entrenador.EntrenadorRoket  import EntrenadorRoket
from gestorAplicacion.lugares.Gimnasio  import Gimnasio
from gestorAplicacion.lugares.CentroPokemon import CentroPokemon
from gestorAplicacion.lugares.CampoDeBatalla import CampoDeBatalla
from gestorAplicacion.pokemon.Habilidad import Habilidad
from gestorAplicacion.pokemon.Pokemon import Pokemon


cetro = CentroPokemon()
Gym = Gimnasio("UNAL",None)
pokemones = []
pok1 = Pokemon("Ponyta")
pok2 = Pokemon("Gyarados")
p1 = Entrenador("david", [1,2,3],2,["betulia"])
p2 = EntrenadorGimnasio("haison",[4,5,6],4,["betulia"],Gym)
Gym.setEntrenador(p2)
p3 = EntrenadorRoket("james",[1,2,3],1)
pok1.quitarVida(100)
print(p1)
print(p2)
print(p3)
print(pok1)
print(pok2)
print(cetro.CurarPokemon(pok1))
print(pok1)