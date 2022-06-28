from gestorAplicacion.pokemon.Habilidad import Habilidad


class Pokemon():

    def __init__(self, nombre, bot=None):
        self._nombre = nombre
        self._bot = False
        self._especie = None
        self._habilidades = []
        self._nivelMaximo = None
        self._vida = None
        self._vidaMaxima = None
        self._numeroHailidades = None

        # Pokemones electricos
        if self._nombre == "Pikachu":
            self._especie = "Electrico"
            self._nivelMaximo = 100
            self._numeroHailidades = 3
            self._habilidades.append(Habilidad("carga"))
            self._habilidades.append(Habilidad("rayo"))
            self._habilidades.append(Habilidad("impactrueno"))
            self._vida = 200
            self._vidaMaxima = 200
        
        if self._nombre == "Electrode":
            self._especie = "Electrico"
            self._nivelMaximo = 100
            self._numeroHailidades = 3
            self._habilidades.append(Habilidad("electrocañon"))
            self._habilidades.append(Habilidad("puño trueno"))
            self._habilidades.append(Habilidad("chispa"))
            self._vida = 200
            self._vidaMaxima = 200

        if self._nombre == "Voltrob":
            self._especie = "Electrico"
            self._nivelMaximo = 100
            self._numeroHailidades = 3
            self._habilidades.append(Habilidad("tecnon shock"))
            self._habilidades.append(Habilidad("puño trueno"))
            self._habilidades.append(Habilidad("rayo"))
            self._vida = 200
            
        #Pokemones acuaticos
        if self._nombre == "Squirtle":
            self._especie = "Agua"
            self._nivelMaximo = 100
            self._numeroHailidades = 3
            self._habilidades.append(Habilidad("chapuzon"))
            self._habilidades.append(Habilidad("agua lodosa"))
            self._habilidades.append(Habilidad("cascada"))
            self._vida = 400
            self._vidaMaxima = 400

        if self._nombre == "Gyarados":
            self._especie = "Agua"
            self._nivelMaximo = 100
            self._numeroHailidades = 3
            self._habilidades.append(Habilidad("hidrocañon"))
            self._habilidades.append(Habilidad("hidrobomba"))
            self._habilidades.append(Habilidad("hidropulzo"))
            self._vida = 200
            self._vidaMaxima = 200
        
        if self._nombre == "Tentacool":
            self._especie = "Agua"
            self._nivelMaximo = 100
            self._numeroHailidades = 3
            self._habilidades.append(Habilidad("acua jet"))
            self._habilidades.append(Habilidad("rayo burbuja"))
            self._habilidades.append(Habilidad("salmuera"))
            self._vida = 200
            self._vidaMaxima = 200
        
        # Pokemones de fuego
        if self._nombre == "Charmander":
            self._especie = "Fuego"
            self._nivelMaximo = 110
            self._numeroHailidades = 3
            self._habilidades.append(Habilidad("incendio"))
            self._habilidades.append(Habilidad("calor"))
            self._habilidades.append(Habilidad("quemadura"))
            self._vida = 200
            self._vidaMaxima = 200
        if self._nombre == "Ponyta":
            self._especie = "Fuego"
            self._nivelMaximo = 110
            self._numeroHailidades = 3
            self._habilidades.append(Habilidad("llamarada"))
            self._habilidades.append(Habilidad("anillo igneo"))
            self._habilidades.append(Habilidad("sofoco"))
            self._vida = 200
            self._vidaMaxima = 200
        if self._nombre == "Magmar":
            self._especie = "Fuego"
            self._nivelMaximo = 110
            self._numeroHailidades = 3
            self._habilidades.append(Habilidad("incendio"))
            self._habilidades.append(Habilidad("anillo igneo"))
            self._habilidades.append(Habilidad("lanzallamas"))
            self._vida = 200
            self._vidaMaxima = 200
        
        #Pokemoes Venenosos
        if self._nombre == "Gastly":
            self._especie = "Veneno"
            self._nivelMaximo = 70
            self._numeroHailidades = 3
            self._habilidades.append(Habilidad("acido"))
            self._habilidades.append(Habilidad("boma lodo"))
            self._habilidades.append(Habilidad("lanzamugre"))
            self._vida = 300
            self._vidaMaxima = 300
        if self._nombre == "Ekans":
            self._especie = "Veneno"
            self._nivelMaximo = 70
            self._numeroHailidades = 3
            self._habilidades.append(Habilidad("veneno X"))
            self._habilidades.append(Habilidad("veneno Y"))
            self._habilidades.append(Habilidad("bomba acida"))
            self._vida = 300
            self._vidaMaxima = 300
        if self._nombre == "Muk":
            self._especie = "Veneno"
            self._nivelMaximo = 70
            self._numeroHailidades = 4
            self._habilidades.append(Habilidad("veneno X"))
            self._habilidades.append(Habilidad("bomba lodo"))
            self._habilidades.append(Habilidad("bomba acida"))
            self._habilidades.append(Habilidad("lanzamugre"))
            self._vida = 300
            self._vidaMaxima = 300

        #pokemoes planta
        if self._nombre == "Bulbasur":
            self._especie = "Planta"
            self._nivelMaximo = 90
            self._numeroHailidades = 3
            self._habilidades.append(Habilidad("hoja afilada"))
            self._habilidades.append(Habilidad("tormeta floral"))
            self._habilidades.append(Habilidad("ciclon de hojas"))
            self._vida = 250
            self._vidaMaxima = 250
        if self._nombre == "Gloom":
            self._especie = "Planta"
            self._nivelMaximo = 90
            self._numeroHailidades = 3
            self._habilidades.append(Habilidad("hierba lazo"))
            self._habilidades.append(Habilidad("semilladora"))
            self._habilidades.append(Habilidad("bomba germen"))
            self._vida = 250
            self._vidaMaxima = 250
        if self._nombre == "Venusaur":
            self._especie = "Planta"
            self._nivelMaximo = 90
            self._numeroHailidades = 3
            self._habilidades.append(Habilidad("hoja afilada"))
            self._habilidades.append(Habilidad("semilladora"))
            self._habilidades.append(Habilidad("latigo cepa"))
            self._vida = 250
            self._vidaMaxima = 250


    """Metodos especiales y toString"""
    def __str__(self) -> str:
        return "Especie: {}\nNombre: {}\nNivel: {}\nVida: {}\nVidaMaxima: {}".format(self._especie,self._nombre,self._nivelMaximo,self._vida,self._vidaMaxima)

    def lazarHabilidad(self,h,p):
        ha = ""
        for i in self._habilidades:
            if i.getNombre() == h:
                ha = i
        return p.quitarVida() + "se ha lanzado {} a {}\nLa vida de {} se ha reducido".format(ha.getNomre(),p.getNombre(),p.getNombre())

    def quitarVida(self,r):
        if (self._vida - r <= 0):
            self._vida = 0
            return "ha muerto " + self._nombre
        else:
            self._vida -= r
            return "se le ha quitado "+str(r)+" vida a "+self._nombre

    def pokvid(self):
        return self._nombre + " vida: " + self._vida

    """getters y setters"""
    def getNombre(self):
        return self._nombre

    def getNumeroHabilidades(self):
        return self._numeroHailidades

    def getHabilidades(self):
        return self._habilidades

    def getVida(self):
        return self._vida

    def getVidaMax(self):
        return self._vidaMaxima

    def setVida(self, aumento):
        self._vida = self._vidaMaxima

    def getEspecie(self):
        return self._especie