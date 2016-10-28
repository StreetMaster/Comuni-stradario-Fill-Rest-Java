/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demofillrest;

import java.util.List;

/**
 *
 * @author toaiari
 */

public class FillResponse {
    public int Norm;
    public int CodErr;
    public int NumCand;
    public List<FillCand> Output;
}
