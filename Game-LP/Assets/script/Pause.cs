using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Pause : MonoBehaviour
{
    public GameObject pauseMenu;

    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        PausarJogo();
    }

    public void PausarJogo()
    {
        if(Input.GetKeyDown(KeyCode.Escape)){
            Time.timeScale = 0f;
            pauseMenu.SetActive(true);
        }
    }

    public void Voltar()
    {
        pauseMenu.SetActive(false);
        Time.timeScale = 1f;
    }

}
