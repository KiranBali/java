package com.yoti.api.client;

/**
 * Profile of an human user with convenience methods to access well-known attributes.
 *
 *
 */
public interface HumanProfile extends Profile {
    /**
     * Corresponds to primary name in passport, and surname in English. 
     * @return the surname
     */
    String getFamilyName();

    /**
     * Corresponds to secondary names in passport, and first/middle names in English.
     * 
     * @return the name
     */
    String getGivenNames();

    /**
     * Equal to ${given_names} + " " + ${family_name}.
     * 
     * @return the given names + the surname
     */
    String getFullName();

    /**
     * Date of birth
     * 
     * @return Date of birth
     */
    Date getDateOfBirth();

    /**
     * Corresponds to the gender in the passport; will be one of the strings "MALE", "FEMALE" or "OTHER".
     *
     *@return the gender
     */
    Gender getGender();

    /**
     * Corresponds to the nationality in the passport.
     *
     * @return the nationality
     */
    String getNationality();

    /**
     * The user's phone number, as verified at registration time. This will be a number with + for international prefix
     * and no spaces, e.g. "+447777123456".
     * 
     * @return the phone number
     */
    String getPhoneNumber();

    /**
     * Photograph of user, encoded as a JPEG image.
     * 
     * @return the selfie
     */
    Image getSelfie();

    /**
     * The user's verified email address.
     * 
     * @return the email address
     */
    String getEmailAddress();

    /**
     * Document details
     * 
     * @return the document details
     */
    DocumentDetails getDocumentDetails();

    static enum Gender {
        MALE, FEMALE, OTHER
    }
}
