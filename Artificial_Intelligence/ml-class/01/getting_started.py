import numpy as np 
from sklearn.linear_model import  LinearRegression

X = np.array([[1,1],[1,2],[2,2],[2,3]])
y = np.dot(X, np.array([1,2])) + 3

reg = LinearRegression().fit(X,y)
print("\n",reg.score(X,y),"\n",reg.coef_,"\n",reg.intercept_,"\n",reg.predict(np.array([[3,5]])))