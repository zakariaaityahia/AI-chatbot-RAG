import {Button, TextField} from "@vaadin/react-components";
import {useState} from "react";
import {ChatAiService} from "Frontend/generated/endpoints";
import Markdown from "react-markdown";

export default function Chat() {
    const [question, setQuestion] = useState<string>("")
    const [response, setResponse] = useState<string>("")
    async function send() {
        ChatAiService.ragChat(question).then(resp=> {
            setResponse(resp);
        });
    }
    return (
        <div className="p-m">
            <h3>chat box</h3>
            <div>
                <TextField style={{width: '80%'}}
                           onChange={(e=> setQuestion(e.target.value))}/>
                <Button className="btn btn-primary" onClick={send}>Send</Button>
                <div>
                    <Markdown>
                        {response}
                    </Markdown>
                </div>
            </div>
        </div>
    )
}