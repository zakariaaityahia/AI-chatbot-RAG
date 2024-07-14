package org.example.aichatbotrag.web;

import org.example.aichatbotrag.services.ChatAiService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatRestController {
    private ChatAiService chatAiService;

    public ChatRestController(ChatAiService chatAiService) {
        this.chatAiService = chatAiService;
    }
    @GetMapping(value = "/ask", produces = MediaType.TEXT_PLAIN_VALUE)
    public String ask(String question){
        return chatAiService.ragChat(question);
    }
}
