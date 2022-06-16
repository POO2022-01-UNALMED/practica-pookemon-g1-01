from gestorAplicacion.entrenador.Entrenador  import *
from gestorAplicacion.entrenador.EntrenadorGimnasio  import *
from gestorAplicacion.entrenador.EntrenadorRoket  import *
from gestorAplicacion.lugares.Gimnasio  import *
from gestorAplicacion.lugares.CentroPokemon import *

Gym = Gimnasio("ITM",None)

p1 = Entrenador("david", [1,2,3],2,["betulia"])
p2 = EntrenadorGimnasio("luisa",[4,5,6],4,["betulia"],Gym)
Gym.setEntrenador(p2)
p3 = EntrenadorRoket("james",[1,2,3],1)

print(p1)
print(p2)
print(p3)