import math
import numpy as np
import pandas as pd

vF = 20;
xF = 0
yF = 0
destroyDistance = 10

bomberPath = [
    [80,0],
    [90,-2],
    [99,-5],
    [116,-15],
    [125,-17],
    [133,-18],
    [141,-23],
    [151,-29],
    [160,-28],
    [169,-25],
    [179,-21],
    [180,-20],
    [190,-17]
    
]

bomberPathDF = pd.DataFrame((bomberPath))
print(bomberPathDF,"\n\n\n")




def calPos(xF,yF,xB,yB):
    dist = math.sqrt(((yB-yF)**2+(xB-xF)**2))
    print("dist = " ,dist)

    sinQ = (yB-yF)/dist
    cosQ = (xB-xF)/dist

    xFNext = xF + vF*cosQ
    yFNext = yF + vF*sinQ

    return xFNext,yFNext,dist


for posBomber in bomberPath:
    xF,yF ,distance = calPos(xF,yF,posBomber[0],posBomber[1])
    if (distance< destroyDistance):
        print("\n\n\nbomber was Destroyed at ", posBomber,"\n\n\n")
        break

