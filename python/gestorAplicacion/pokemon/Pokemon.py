from gestorAplicacion.pokemon.Habilidad import Habilidad


class Pokemon():

    def __init__(self, nombre, bot=None):
        self._nombre = nombre
        self._bot = False
        self.especie = None
        self.habilidades = []
        self.nivelMaximo = None
        self.vida = None
        self.vidaMaxima = None
        self.numeroHailidades = None

        # Pokemones electricos
        if self._nombre == "Pikachu":
            self.especie = "Electrico"
            self.nivelMaximo = 100
            self.numeroHailidades = 3
            self.habilidades.append(Habilidad("carga"))
            self.habilidades.append(Habilidad("rayo"))
            self.habilidades.append(Habilidad("impactrueno"))
            self.vida = 200
            self.vidaMaxima = 200
        
        if self._nombre == "Electrode":
            self.especie = "Electrico"
            self.nivelMaximo = 100
            self.numeroHailidades = 3
            self.habilidades.append(Habilidad("electrocañon"))
            self.habilidades.append(Habilidad("puño trueno"))
            self.habilidades.append(Habilidad("chispa"))
            self.vida = 200
            self.vidaMaxima = 200

        if self._nombre == "Voltrob":
            self.especie = "Electrico"
            self.nivelMaximo = 100
            self.numeroHailidades = 3
            self.habilidades.append(Habilidad("tecnon shock"))
            self.habilidades.append(Habilidad("puño trueno"))
            self.habilidades.append(Habilidad("rayo"))
            self.vida = 200
            
        #Pokemones acuaticos
        if self._nombre == "Squirtle":
            self.especie = "Agua"
            self.nivelMaximo = 100
            self.numeroHailidades = 3
            self.habilidades.append(Habilidad("chapuzon"))
            self.habilidades.append(Habilidad("agua lodosa"))
            self.habilidades.append(Habilidad("cascada"))
            self.vida = 400
            self.vidaMaxima = 400

        if self._nombre == "Gyarados":
            self.especie = "Agua"
            self.nivelMaximo = 100
            self.numeroHailidades = 3
            self.habilidades.append(Habilidad("hidrocañon"))
            self.habilidades.append(Habilidad("hidrobomba"))
            self.habilidades.append(Habilidad("hidropulzo"))
            self.vida = 200
            self.vidaMaxima = 200
        
        if self._nombre == "Tentacool":
            self.especie = "Agua"
            self.nivelMaximo = 100
            self.numeroHailidades = 3
            self.habilidades.append(Habilidad("acua jet"))
            self.habilidades.append(Habilidad("rayo burbuja"))
            self.habilidades.append(Habilidad("salmuera"))
            self.vida = 200
            self.vidaMaxima = 200
        
        # Pokemones de fuego
        if self._nombre == "Charmander":
            self.especie = "Fuego"
            self.nivelMaximo = 110
            self.numeroHailidades = 3
            self.habilidades.append(Habilidad("incendio"))
            self.habilidades.append(Habilidad("calor"))
            self.habilidades.append(Habilidad("quemadura"))
            self.vida = 200
            self.vidaMaxima = 200
        if self._nombre == "Ponyta":
            self.especie = "Fuego"
            self.nivelMaximo = 110
            self.numeroHailidades = 3
            self.habilidades.append(Habilidad("llamarada"))
            self.habilidades.append(Habilidad("anillo igneo"))
            self.habilidades.append(Habilidad("sofoco"))
            self.vida = 200
            self.vidaMaxima = 200
        if self._nombre == "Magmar":
            self.especie = "Fuego"
            self.nivelMaximo = 110
            self.numeroHailidades = 3
            self.habilidades.append(Habilidad("incendio"))
            self.habilidades.append(Habilidad("anillo igneo"))
            self.habilidades.append(Habilidad("lanzallamas"))
            self.vida = 200
            self.vidaMaxima = 200
        
        #Pokemoes Venenosos
        if self._nombre == "Gastly":
            self.especie = "Veneno"
            self.nivelMaximo = 70
            self.numeroHailidades = 3
            self.habilidades.append(Habilidad("acido"))
            self.habilidades.append(Habilidad("boma lodo"))
            self.habilidades.append(Habilidad("lanzamugre"))
            self.vida = 300
            self.vidaMaxima = 300
        if self._nombre == "Ekans":
            self.especie = "Veneno"
            self.nivelMaximo = 70
            self.numeroHailidades = 3
            self.habilidades.append(Habilidad("veneno X"))
            self.habilidades.append(Habilidad("veneno Y"))
            self.habilidades.append(Habilidad("bomba acida"))
            self.vida = 300
            self.vidaMaxima = 300
        if self._nombre == "Muk":
            self.especie = "Veneno"
            self.nivelMaximo = 70
            self.numeroHailidades = 4
            self.habilidades.append(Habilidad("veneno X"))
            self.habilidades.append(Habilidad("bomba lodo"))
            self.habilidades.append(Habilidad("bomba acida"))
            self.habilidades.append(Habilidad("lanzamugre"))
            self.vida = 300
            self.vidaMaxima = 300

        #pokemoes planta
        if self._nombre == "Bulbasur":
            self.especie = "Planta"
            self.nivelMaximo = 90
            self.numeroHailidades = 3
            self.habilidades.append(Habilidad("hoja afilada"))
            self.habilidades.append(Habilidad("tormeta floral"))
            self.habilidades.append(Habilidad("ciclon de hojas"))
            self.vida = 250
            self.vidaMaxima = 250
        if self._nombre == "Gloom":
            self.especie = "Planta"
            self.nivelMaximo = 90
            self.numeroHailidades = 3
            self.habilidades.append(Habilidad("hierba lazo"))
            self.habilidades.append(Habilidad("semilladora"))
            self.habilidades.append(Habilidad("bomba germen"))
            self.vida = 250
            self.vidaMaxima = 250
        if self._nombre == "Venusaur":
            self.especie = "Planta"
            self.nivelMaximo = 90
            self.numeroHailidades = 3
            self.habilidades.append(Habilidad("hoja afilada"))
            self.habilidades.append(Habilidad("semilladora"))
            self.habilidades.append(Habilidad("latigo cepa"))
            self.vida = 250
            self.vidaMaxima = 250


    """Metodos especiales y toString"""
    def __str__(self) -> str:
        return "Especie: {}\nNombre: {}\nNivel: {}\nVida: {}\nVidaMaxima: {}".format(self.especie,self._nombre,self.nivelMaximo,self.vida,self.vidaMaxima)

    def lazarHabilidad(self,h,p):
        ha = ""
        for i in self.habilidades:
            if i.getNombre() == h:
                ha = i
        return p.quitarVida() + "se ha lanzado {} a {}\nLa vida de {} se ha reducido".format(ha.getNomre(),p.getNombre(),p.getNombre())

    def quitarVida(self,r):
        if (self.vida - r <= 0):
            self.vida = 0
            return "ha muerto " + self._nombre
        else:
            self.vida -= r
            return ""

    def pokvid(self):
        return self._nombre + " vida: " + self.vida

    """getters y setters"""
    def getNombre(self):
        return self._nombre

    def getNumeroHabilidades(self):
        return self.numeroHailidades

    def getHabilidades(self):
        return self.habilidades

    def getVida(self):
        return self.vida

    def getVidaMax(self):
        return self.vidaMaxima

    def setVidaMax(self, aumento):
        self.vida = self.vidaMaxima

    def getEspecie(self):
        return self.especie