from csv import reader
import os

    #------------------------ Funciones que utilizare ------------------------

def repetir():      #Realizar otra operacion
    while True:
        try:
            r=int(input("Deseas realizar otra operacion?\n1: Si\n2: No\n"))
            if r==1:
                return True
            elif r==2:
                os.system("cls")
                return False
            else:
                print("Opcion invalida")
        except ValueError:
            print("Valor incorrecto")

def mes(numM):      #Transformar un numero en un mes
    if numM==1:
        return "Enero"
    if numM==2:
        return "Febrero"
    if numM==3:
        return "Marzo"
    if numM==4:
        return "Abril"
    if numM==5:
        return "Mayo"
    if numM==6:
        return "Marzo"
   
    #-------------------------------------------------- Aqui comienza el programa ------------------------------------------------------------------
R=True
os.system("cls")
while R==True:          # Se repite hasta que el usuario decida ya no realizar otra operacion
    
    try:
        print("Que accion desea realizar\n")
        print("1: Mostrar en pantalla la diferencia de seguidores (followers) en Twitter entre el mes de enero y junio")
        print("2: Calcular la diferencia de visualizaciones de YouTube entre los meses seleccionados")
        print("3: Calcular el promedio de crecimiento de Twitter y Facebook entre los meses de enero a junio")
        accion=int(input("Ingresa el numero de la opcion: "))

        if accion==1:       #1 operacion
            os.system("cls")
            with open("presenciaredes.csv","r") as csvFile:
                datos = reader(csvFile)
                for i in datos:
                    if i[0]=="TWITTER":
                        if i[1]=="SEGUIDORES (FOLLOWERS)":
                            a=int(i[8].replace(",",""))-int(i[3].replace(",",""))
                            print("La diferencia de seguidores en Twitter entre los meses enero y junio son",a,"\n")
                            R=(repetir())
                
        elif accion==2:     #2 operacion
            os.system("cls")
            while True:
                try:
                    print("Selecciona el mes inicial\n")
                    print("1: Enero\n2: Febrero\n3: Marzo\n4: Abril\n5: Mayo\n6: Junio\n")
                    mesI=int(input())
                    os.system("cls")
                    if mesI>=1 & mesI<=6:
                        break
                    else:
                        print("Opcion Invalida")
                except ValueError:
                    print("Valor Incorrecto")

            while True:
                try:
                    print("Selecciona el mes final\n")
                    print("1: Enero\n2: Febrero\n3: Marzo\n4: Abril\n5: Mayo\n6: Junio\n")
                    mesF=int(input())
                    os.system("cls")
                    if mesF>=1 & mesF<=6:
                        break
                    else:
                        print("Opcion Invalida")
                except ValueError:
                    print("Valor Incorrecto")


            with open("presenciaredes.csv","r") as csvFile:
                datos = reader(csvFile)
                for i in datos:
                    if i[0]=="YOUTUBE":
                        if i[1]=="VISUALIZACIONES":
                            a=abs(int(i[mesF+2].replace(",",""))-int(i[mesI+2].replace(",","")))
                            mesI=mes(mesI)
                            mesF=mes(mesF)
                            print("La diferencia de Visualizaciones en Youtube entre los meses",mesI,"y",mesF,"son",a,"\n")
                            R=(repetir())

        elif accion==3:     #3 operacion
            os.system("cls")
            with open("presenciaredes.csv","r") as csvFile:
                datos = reader(csvFile)
                for i in datos:
                    if i[0]=="TWITTER":
                        if i[1]=="SEGUIDORES (FOLLOWERS)":
                            a=(int(i[8].replace(",",""))-int(i[3].replace(",","")))/int(i[3].replace(",",""))*100
                            print("El promedio de crecimiento en Twitter entre los meses enero y junio es de","{0:.4f}".format(a)+"%\n")
                    if i[0]=="FACEBOOK":
                        if i[1]=="SEGUIDORES":
                            a=(int(i[8].replace(",",""))-int(i[3].replace(",","")))/int(i[3].replace(",",""))*100
                            print("El promedio de crecimiento en Facebook entre los meses enero y junio es de","{0:.4f}".format(a)+"%\n")
                R=(repetir())

        else:               #Como no hay switch en python este representa el default para valores diferentes
            os.system("cls")
            print("Opcion no valida\n")

    except ValueError:
        os.system("cls")
        print("Valor incorrecto, ingresa un numero\n")