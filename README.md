# Locatr
Приложение определяет текущее местоположение пользователя, после чего ищет фотографии окрестностей на сервисе Flickr и выводит найденные изображения на карте.

В классе FlickrFetchr.java (...\app\src\main\java\ru\ilyasmirnov\android\locatr\FlickrFetchr.java) в переменной API_KEY следует указать свой ключ. Чтобы получить ключ API, обратитесь по адресу www.flickr.com/services/api/ и проследуйте по ссылке API keys. Для входа вам понадобится идентификатор Yahoo. После входа зарегистрируйте новый некоммерческий ключ API. Ваш ключ API будет выглядеть примерно так: 4f721bgafa75bf6d2cb9af54f937bb70. («Секрет» в данном случае не нужен — он используется только при работе с пользовательской информацией или изображениями.)

Выполните инструкции в файле google_maps_api.xml (...\app\src\debug\res\values\google_maps_api.xml), чтобы получить работоспособный ключ API. Ключ должен выглядеть примерно так: AIzaSyClrnnYZEx0iYmJkIc0K4rdObrXcFkLl-U.

![application screen](https://github.com/SmirnovIlya1986/ApplicationScreen/blob/master/Locatr_Portrait_Screen.jpg)
