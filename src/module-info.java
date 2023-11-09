module ArabicGreeter {
    requires Greeter.API;
    provides com.example.greeterapi.Greeter with com.example.arabicgreeter.ArabicGreeter;
}