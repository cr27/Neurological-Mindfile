//Copyright 2019, Jordan Browning, All rights reserved
import keras
import os
import numpy as np
import matplotlib.pyplot as plt
import matplotlib.image as mpimg
from keras import optimizers
from keras import regularizers

from keras.preprocessing.image import ImageDataGenerator
#datagen = ImageDataGenerator(rescale =1. /255,)
#datagen_generator = datagen.flow_from_directory( '/Users/abc/Desktop/Dataset', target_size=(img_height, img_width),batch_size=batch_size,class_mode=None,shuffle=False)
from PIL import Image
import numpy as np

def load_image( infilename ) :
    img = Image.open( infilename )
    img.load()
    data = np.asarray( img, dtype="int32" )
    return data

images = []





for fname in os.listdir('/Users/abc/Desktop/Dataset') :
    if fname [-4:] == '.jpg':
        path=os.path.join('/Users/abc/Desktop/Dataset', fname)
        data=load_image(path)
        image = 128*np.ones([1080,1920,3])
        image [:data.shape[0],:data.shape[1],:data.shape[2]] = data
        images.append(image)
        #plt.imshow(image.astype(int))
        #plt.show()
        print(path)

y = [0,1,2,0,1,2,0,1,2,0,0,1,2,0,1] #list of labels

#x = [NG,P,NI] list of images

from keras.models import Sequential
from keras.layers import Dense, Dropout, Activation, Flatten
from keras.layers import Convolution2D, MaxPooling2D
from keras.utils import np_utils
from keras.models import Sequential
from keras.layers import Dense, Dropout, Activation, Flatten
from keras.layers import Convolution2D, MaxPooling2D
x = np.array(images)
X_train = x.astype('float32')/255
from keras.utils import np_utils
Y_train = np_utils.to_categorical(y, 3)
model = Sequential()
model.add(Flatten(input_shape=(1080,1920,3)))
#model.add(Dense(32, activation='relu'))
model.add(Dense(3, kernel_regularizer=regularizers.l2(1), activation='softmax'))
opt= optimizers.SGD(lr=0.001, decay=1e-6, momentum=0.9, nesterov=True)
model.compile(loss='categorical_crossentropy', optimizer=opt, metrics=['accuracy'])
model.fit(X_train, Y_train, batch_size=15, nb_epoch=1000, verbose=1)
print(model.evaluate(X_train, Y_train))
   







