
// Get a Client
HttpClient httpClient = new HttpClient();

// Start server
httpClient.start();

// do a get request
ContentResponse response = httpClient
.GET("http://www.vogella.com")
.get();

// Issue a post request
ContentResponse response = httpClient
.POST("https://www.vogella.com/entity/1")
.param("p", "value")
.send()
.get(5, TimeUnit.SECONDS);

