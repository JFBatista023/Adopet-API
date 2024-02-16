package br.com.alura.commands;

import java.io.IOException;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.interfaces.Command;
import br.com.alura.service.PetService;

public class ListarPetsDoAbrigoCommand implements Command {

    @Override
    public void execute() {
        ClientHttpConfiguration client = new ClientHttpConfiguration();
        PetService petService = new PetService(client);

        try {
            petService.listarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
