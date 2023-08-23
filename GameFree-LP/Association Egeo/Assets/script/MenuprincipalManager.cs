using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;
using UnityEngine.UI;

public class MenuprincipalManager : MonoBehaviour
{

    [SerializeField] private GameObject painelMenuPrincipal;
    [SerializeField] private GameObject painelOpcoes;

   public void Start()
   {
       
   }

   public void ComerJogo()
   {
       SceneManager.LoadScene(1);
   }

   public void abriropcoes()
   {
       painelMenuPrincipal.SetActive(false);
       painelOpcoes.SetActive(true);
   }

   public void Fecharopcoes()
   {
        painelOpcoes.SetActive(false);
        painelMenuPrincipal.SetActive(true);
   }

   public void QuitGame()
   {
       Debug.Log("Sair do Jogo");
       Application.Quit();
   }
}

