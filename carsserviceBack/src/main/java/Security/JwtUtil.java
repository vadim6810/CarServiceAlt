package Security;

import com.cservice.Entity.Commons.Account;
import com.cservice.Entity.Commons.Role;
import io.jsonwebtoken.*;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.SecurityProperties;


public class JwtUtil {
    @Value("${jwt.secret}")
    private String secret;

    @Autowired
    Account acc;

    /**
     * Tries to parse specified String as a JWT token. If successful, returns Account object with username, id and role prefilled (extracted from token).
     * If unsuccessful (token is invalid or not containing all required user properties), simply returns null.
     *
     * @param token the JWT token to parse
     * @return the Account object extracted from specified token or null if a token is invalid.
     */
    public Account parseToken(String token) {
        try {
            Claims body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();


            acc.setName(body.getSubject());
            acc.setId(Long.parseLong((String) body.get("userId")));
            acc.setRole((Role) body.get("role"));

            return acc;

        } catch (JwtException | ClassCastException e) {
            return null;
        }
    }

    /**
     * Generates a JWT token containing username as subject, and userId and role as additional claims. These properties are taken from the specified
     * Account object. Tokens validity is infinite.
     *
     * @param acc the user for which the token will be generated
     * @return the JWT token
     */
    public String generateToken(Account acc) {
        Claims claims = Jwts.claims().setSubject(acc.getName());
        claims.put("userId", acc.getId() + "");
        claims.put("role", acc.getRole());
        claims.put("token_exp_date","");

        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }
}
