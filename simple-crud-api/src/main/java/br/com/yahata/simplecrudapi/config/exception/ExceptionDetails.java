package br.com.yahata.simplecrudapi.config.exception;

public record ExceptionDetails(
        int status,
        String msg) {
}
